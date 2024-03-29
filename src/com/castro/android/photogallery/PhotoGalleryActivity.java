package com.castro.android.photogallery;

import com.bignerdranch.android.photogallery.R;

import android.app.SearchManager;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.Log;

public class PhotoGalleryActivity extends SingleFragmentActivity {

	private static final String TAG = "PhotoGalleryActivity";

	@Override
	protected Fragment createFragment() {
		return new PhotoGalleryFragment();
	}

	@Override
	public void onNewIntent(Intent intent) {
		PhotoGalleryFragment fragment = (PhotoGalleryFragment) 
				getSupportFragmentManager()
				.findFragmentById(R.id.fragmentContainer);

		if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
			String query = intent.getStringExtra(SearchManager.QUERY);
			Log.i(TAG, "Recieved a new search query: " + query);

			PreferenceManager.getDefaultSharedPreferences(this)
					.edit()
					.putString(FlickrFetchr.PREF_SEARCH_QUERY, query)
					.commit();

		}
		fragment.updateItems();
	}

}
