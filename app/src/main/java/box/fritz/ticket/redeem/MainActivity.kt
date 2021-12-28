package box.fritz.ticket.redeem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.net.http.SslError

import android.webkit.SslErrorHandler
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView = WebView(this@MainActivity)
        setContentView(myWebView)

        loadWebView(myWebView)
    }

    fun loadWebView(webView: WebView) {
        webView.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(
                view: WebView,
                handler: SslErrorHandler,
                error: SslError
            ) {
                handler.proceed()
            }
        }

        webView.loadUrl("https://fritz.box/tools/kids_not_allowed.lua")
    }
}