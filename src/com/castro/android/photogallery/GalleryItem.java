package com.castro.android.photogallery;

public class GalleryItem {
	private String mCaption;
	private String mId;
	private String mUrl;
	private String mOwner;
	
	public String toString () {
		return mCaption;
	}

	public String getCaption() {
		return mCaption;
	}

	public void setCaption(String caption) {
		mCaption = caption;
	}

	public String getId() {
		return mId;
	}

	public void setId(String id) {
		mId = id;
	}

	public String getUrl() {
		return mUrl;
	}

	public void setUrl(String url) {
		mUrl = url;
	}

	/**
	 * @return the owner
	 */
	public String getOwner() {
		return mOwner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		mOwner = owner;
	}
	
	public String getPhotoPageURL() {
		return "http://www.flickr.com/photos/" +mOwner + "/" +mId;
	}
	
}
