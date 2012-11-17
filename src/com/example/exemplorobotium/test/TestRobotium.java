package com.example.exemplorobotium.test;

import android.test.ActivityInstrumentationTestCase2;

import com.example.exemplorobotium.MainActivity;
import com.jayway.android.robotium.solo.Solo;

public class TestRobotium extends ActivityInstrumentationTestCase2<MainActivity>{
	
	private Solo solo;

	public TestRobotium() {
		super("com.example.exemplorobotium", MainActivity.class);
	}
	
	 public void setUp() throws Exception {
	       solo = new Solo(getInstrumentation(), getActivity());
	  }
	
	public void testBotaoDaSegundaTela() {
		assertTrue(solo.searchText("Testando"));
		solo.clickOnButton(0);
		
		solo.enterText(0, "Olá");
		solo.clickOnButton(0);
		assertTrue(solo.searchText("Olá"));
		
		solo.sleep(2000);
		solo.clearEditText(0);
		solo.enterText(0, "Teste 01");
		solo.clickOnButton(0);
		assertTrue(solo.searchText("Teste 01"));
		
		solo.sleep(2000);
		solo.clearEditText(0);
		solo.enterText(0, "ABC!");
		solo.clickOnButton(0);
		assertTrue(solo.searchText("ABC!"));
	}

}
