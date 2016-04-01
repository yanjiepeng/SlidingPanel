package test.slingding.com.slidingpanel;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Administrator on 2016/3/31.
 */
public class ShowFragment extends Fragment {


    WebView webView = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.show, container, false);

        webView = (WebView) view.findViewById(R.id.webview);

        return view;


    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    public WebView getWebView() {
        return webView;
    }
}
