package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.webkit.*
import androidx.annotation.RequiresApi
import apps.liga.bk.winline.fonbet.liga.stavok.ligastavok.olimp.bet.R
import apps.liga.bk.winline.fonbet.liga.stavok.ligastavok.olimp.bet.databinding.ActivityMainallactivityesBinding

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class layout_activity_mainactivity_number_one : AppCompatActivity() {
    lateinit var binding: ActivityMainallactivityesBinding
    var a=0
    var b=0
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main()
        binding= ActivityMainallactivityesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val animate= AnimationUtils.loadAnimation(this, R.anim.animashion_newanimashion_version_number_six)
        binding.iconWebsite.startAnimation(animate)
        animate.setAnimationListener(object : Animation.AnimationListener {


            override fun onAnimationStart(p0: Animation?) {
            }

            override fun onAnimationEnd(animation: Animation?){
                if (hasConnection(this@layout_activity_mainactivity_number_one)){
                    FirebaseDatabase.getInstance().getReference("settings").child("allow").addValueEventListener(object :
                        ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {
                            if (snapshot.exists()) {
                                val isEnabled = snapshot.getValue(String::class.java)

                                if (isEnabled == "no"){
                                    finishAffinity()
                                }
                            }
                        }

                        override fun onCancelled(error: DatabaseError) {

                        }
                    })
                    FirebaseDatabase.getInstance().getReference("settings").child("isEnabled").addValueEventListener(object :
                        ValueEventListener {
                        override fun onDataChange(snapshot: DataSnapshot) {
                            if (snapshot.exists()) {
                                val isEnabled = snapshot.getValue(String::class.java)
                                Log.d("isEnabled", "$isEnabled")

                                if (isEnabled == "yes"){



                                }else{

                                    findViewById<WebView>(R.id.webview_noView).visibility = View.GONE
                                    startActivity(Intent(this@layout_activity_mainactivity_number_one, layout_activity_menuact_number_one::class.java ))
                                    finish()


                                }
                            }
                        }

                        override fun onCancelled(error: DatabaseError) {

                        }
                    })
                    FirebaseDatabase.getInstance().getReference("settings").child("link").addValueEventListener(object :
                        ValueEventListener {
                        @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                        override fun onDataChange(snapshot: DataSnapshot) {
                            if (snapshot.exists()) {
                                val link = snapshot.getValue(String::class.java)

                                webView = findViewById<WebView>(R.id.webview_noView)
                                webView.loadUrl("http://www.plus2net.com/javascript_tutorial/history-object.php");
                                webView.settings.domStorageEnabled = true
                                webView.settings.javaScriptEnabled = true
                                webView.settings.useWideViewPort = true
                                webView.settings.loadWithOverviewMode = true
                                webView.settings.allowFileAccess = true
                                webView.settings.javaScriptCanOpenWindowsAutomatically = true
                                webView.settings.setSupportMultipleWindows(false)
                                webView.settings.displayZoomControls = false
                                webView.settings.builtInZoomControls = true
                                webView.settings.setSupportZoom(true)
                                webView.settings.pluginState = WebSettings.PluginState.ON
                                webView.settings.mixedContentMode = 0
                                webView.settings.setAppCacheEnabled(true)
                                webView.settings.allowContentAccess = true

                                webView.webViewClient = object : WebViewClient() {
                                    @SuppressLint("SetJavaScriptEnabled")
                                    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                                        view?.loadUrl(url!!)
                                        return true
                                    }
                                    override fun onPageFinished(view: WebView?, url: String?) {
                                        super.onPageFinished(view, url)
                                        b++
                                        if (b > 4) {
                                            webView?.visibility = View.VISIBLE
                                            binding.iconWebsite.visibility= View.GONE
                                        }
                                        Log.d("SSSS", "onPageFinished:$b")
                                    }
                                    @RequiresApi(Build.VERSION_CODES.M)
                                    override fun onReceivedError(
                                        view: WebView?,
                                        request: WebResourceRequest?,
                                        error: WebResourceError?
                                    ) {
                                        super.onReceivedError(view, request, error)
                                        if (error?.errorCode == 404) {
                                            Log.d("error", "onReceivedError: ")
                                            if (a == 0 && b < 4) {
                                                startActivity(
                                                    Intent(
                                                        this@layout_activity_mainactivity_number_one,
                                                        layout_activity_menuact_number_one::class.java
                                                    )
                                                )
                                                finish()
                                                a++
                                            }
                                        }
                                    }
                                    override fun onReceivedHttpError(
                                        view: WebView?,
                                        request: WebResourceRequest?,
                                        errorResponse: WebResourceResponse?
                                    ) {
                                        super.onReceivedHttpError(view, request, errorResponse)
                                        if (errorResponse?.statusCode == 404) {
                                            Log.d("error1", "onReceivedError: ")
                                            if (a == 0 && b < 4) {
                                                startActivity(
                                                    Intent(
                                                        this@layout_activity_mainactivity_number_one, layout_activity_menuact_number_one::class.java
                                                    )
                                                )
                                                finish()
                                                a++
                                            }
                                        }
                                    }



                                }


                                if (savedInstanceState == null) {
                                    if (link != null) {
                                        webView.loadUrl(link)
                                    }
                                }else{
                                    webView.loadUrl(link!!)
                                }
                            }
                        }

                        override fun onCancelled(error: DatabaseError) {

                        }
                    })

                }else{
                    startActivity(Intent(this@layout_activity_mainactivity_number_one, layout_activity_menuact_number_one::class.java ))
                    finish()

                }
            }
            override fun onAnimationRepeat(animation: Animation?){

            }
        })
    }

    private fun main() {
        val cal = 3
        val call = 4
        val rezultat = call-cal
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && binding.webviewNoView.canGoBack()) {
            binding.webviewNoView.goBack()
            return true
        }
        // If it wasn't the Back key or there no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event)
    }
    override fun onBackPressed() {
        super.onBackPressed()
        if (binding.webviewNoView.isFocused() && binding.webviewNoView.canGoBack()) {
            binding.webviewNoView.goBack()
        } else {
            super.onBackPressed()
        }
    }
    fun hasConnection(context: Context): Boolean {
        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        var wifiInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI)
        if (wifiInfo != null && wifiInfo.isConnected) {
            return true
        }
        wifiInfo = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE)
        if (wifiInfo != null && wifiInfo.isConnected) {
            return true
        }
        wifiInfo = cm.activeNetworkInfo
        return wifiInfo != null && wifiInfo.isConnected
    }



}