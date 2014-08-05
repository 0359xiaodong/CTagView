package com.cloay.ctagviewdemo;

import com.cloay.ctagviewdemo.widget.CTagView;
import com.cloay.ctagviewdemo.widget.CTagView.OnTagClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * 
 * @ClassName: MainActivity 
 * @Description: this is a demo for CTagView 
 * @author cloay Email:shangrody@gmail.com 
 * @date 2014-8-5 ����11:29:09 
 *
 */
public class MainActivity extends Activity implements OnTagClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		String[] tags = {"����", "���շ�", "�ƻ�", "��������", "��Ц", "����", "���������Ķ���", "NBA", "������", "��Ӱ", "�Զ����ǩ"};
		CTagView tagView = (CTagView) findViewById(R.id.tag_view);
		tagView.setOnTagClickListener(this);
		tagView.setTags(tags);
	}

	@Override
	public void onTagClick(String tag) {
		Log.v("CTagViewDemo", "Tag: " + tag);
	}


}
