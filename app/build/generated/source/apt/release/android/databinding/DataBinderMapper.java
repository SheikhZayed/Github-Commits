
package android.databinding;
import com.loktra.interviewapp.BR;
@javax.annotation.Generated("Android Data Binding")
class DataBinderMapper  {
    final static int TARGET_MIN_SDK = 16;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.loktra.interviewapp.R.layout.activity_main:
                    return com.loktra.interviewapp.databinding.ActivityMainBinding.bind(view, bindingComponent);
                case com.loktra.interviewapp.R.layout.content_items:
                    return com.loktra.interviewapp.databinding.ContentItemsBinding.bind(view, bindingComponent);
                case com.loktra.interviewapp.R.layout.fragment_home:
                    return com.loktra.interviewapp.databinding.FragmentHomeBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.loktra.interviewapp.R.layout.activity_main;
                }
                break;
            }
            case -1820755770: {
                if(tag.equals("layout/content_items_0")) {
                    return com.loktra.interviewapp.R.layout.content_items;
                }
                break;
            }
            case -1115993926: {
                if(tag.equals("layout/fragment_home_0")) {
                    return com.loktra.interviewapp.R.layout.fragment_home;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"project"};
    }
}