package com.loktra.interviewapp.databinding;
import com.loktra.interviewapp.R;
import com.loktra.interviewapp.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ContentItemsBinding extends android.databinding.ViewDataBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_thumbnail, 1);
        sViewsWithIds.put(R.id.text_commiter_name, 2);
        sViewsWithIds.put(R.id.text_commiter_id, 3);
        sViewsWithIds.put(R.id.text_commiter_message, 4);
    }
    // views
    @NonNull
    public final android.widget.ImageView imgThumbnail;
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    public final android.widget.TextView textCommiterId;
    @NonNull
    public final android.widget.TextView textCommiterMessage;
    @NonNull
    public final android.widget.TextView textCommiterName;
    // variables
    @Nullable
    private com.loktra.interviewapp.data.model.ProjectResponse mProject;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContentItemsBinding(@NonNull android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds);
        this.imgThumbnail = (android.widget.ImageView) bindings[1];
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textCommiterId = (android.widget.TextView) bindings[3];
        this.textCommiterMessage = (android.widget.TextView) bindings[4];
        this.textCommiterName = (android.widget.TextView) bindings[2];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.project == variableId) {
            setProject((com.loktra.interviewapp.data.model.ProjectResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProject(@Nullable com.loktra.interviewapp.data.model.ProjectResponse Project) {
        this.mProject = Project;
    }
    @Nullable
    public com.loktra.interviewapp.data.model.ProjectResponse getProject() {
        return mProject;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    @NonNull
    public static ContentItemsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ContentItemsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.view.ViewGroup root, boolean attachToRoot, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ContentItemsBinding>inflate(inflater, com.loktra.interviewapp.R.layout.content_items, root, attachToRoot, bindingComponent);
    }
    @NonNull
    public static ContentItemsBinding inflate(@NonNull android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ContentItemsBinding inflate(@NonNull android.view.LayoutInflater inflater, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.loktra.interviewapp.R.layout.content_items, null, false), bindingComponent);
    }
    @NonNull
    public static ContentItemsBinding bind(@NonNull android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    @NonNull
    public static ContentItemsBinding bind(@NonNull android.view.View view, @Nullable android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/content_items_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ContentItemsBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): project
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}