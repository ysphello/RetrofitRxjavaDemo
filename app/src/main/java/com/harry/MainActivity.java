package com.harry;

import com.harry.anno.AnnotationActivity;
import com.harry.image.ImageActivity;
import com.harry.mvp.DownloadActivity;
import com.harry.mvp.TopViewActivity;
import com.harry.reflect.ReflectActivity;
import com.harry.rxjava.RxJavaActivity;
import com.harry.rxjava.UploadActivity;
import com.harry.rxjava.retrofit.TopActivity;
import com.harry.slide.ViewPagerActivity;
import com.harry.video.MovieRecorderActivity;
import com.harry.video.VideoActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected Class[] getActivities() {
        return new Class[]{RxJavaActivity.class, TopActivity.class, UploadActivity.class, VideoActivity.class,
            MovieRecorderActivity.class, ProgressActivity.class, TopViewActivity.class, ViewPagerActivity.class,
            ReflectActivity.class, ImageActivity.class, AnnotationActivity.class, DownloadActivity.class,
            ImmersiveActivity.class,AcessActivity.class};
    }
}
