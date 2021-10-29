package org.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	private WebDriver d;
	private HomePage a;
	private SearchHotelPage s;
	private SelectHotelType se;
	private BookAHotel b;

	public PageObjectManager(WebDriver d) {
		this.d = d;
	}

	public HomePage getHomePage() {
		return (a == null) ? a = new HomePage() : a;

	}

	public SearchHotelPage getSearchHotelPage() {
		return (s == null) ? s = new SearchHotelPage() : s;

	}

	public SelectHotelType getSelectHotelType() {
		return (se == null) ? se = new SelectHotelType() : se;
	}

	public BookAHotel getBookAHotel() {
		return (b == null) ? b = new BookAHotel() : b;
	}

}
