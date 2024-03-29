package com.tung.android.bootstrap.model;

public class NavDrawerItem
{

	private String title;
	private int icon;
	private String count="0";
	// boolean to set visiblity of the counter
		private boolean isCounterVisible = false;
	
		public NavDrawerItem(){}

		public NavDrawerItem(String title, int icon)
		{
			this.title = title;
			this.icon = icon;
		}

		public NavDrawerItem(String title, int icon, boolean isCounterVisible,
                             String count)
		{
		super();
		this.title = title;
		this.icon = icon;
		this.count = count;
		this.isCounterVisible = isCounterVisible;
	}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getIcon() {
			return this.icon;
		}

		public void setIcon(int icon) {
			this.icon = icon;
		}

		public String getCount() {
			return this.count;
		}

		public void setCount(String count) {
			this.count = count;
		}

		public boolean getCounterVisibility(){
			return this.isCounterVisible;
		}

		public void setCounterVisibility(boolean isCounterVisible){
			this.isCounterVisible = isCounterVisible;
		}
				
}
