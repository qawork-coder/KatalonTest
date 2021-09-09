package stepDefination
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class signUpstepsDefination {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Before
	def void before() {
		WebUI.openBrowser('')
	}

	@After
	def void after() {
		WebUI.closeBrowser()
	}

	@Given("User has opened the website")
	def invokeBrowser() {


		WebUI.navigateToUrl("http://demo.guru99.com/V1/index.php")
	}

	@When("User enters username (.*)")
	def enterUsername(def username) {

		WebUI.sendKeys(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_()_uid'), username)
	}

	@When("User enters Password (.*)")
	def enterPassword(def password) {

		WebUI.sendKeys(findTestObject('Object Repository/Page_GTPL Bank Home Page/input_()_password'), password)
	}

	@Then("Click on login")
	def clickLogin() {

		WebUI.click(findTestObject('Object Repository/Page_GTPL Bank Home Page/loginBtn'))
	}
}