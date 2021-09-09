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
import io.cucumber.datatable.DataTable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver

import static org.junit.Assert.assertArrayEquals

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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class FormInoutdetailsAsList {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User should launch the website")
	def invokeAndLuanchBrowser() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl("https://test.qatechhub.com/form-elements/")
	}

	@When("User enters the input Details")
	def inputDetails(DataTable	data) {
		List<String> dataList=data.asList()


		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/firstName'), dataList.get(0))

		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/lastName'), dataList.get(1))

		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/emailAddress'), dataList.get(2))

		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/phoneNumber'), dataList.get(3))

		WebUI.click(findTestObject('Object Repository/QaTEchHub/MaleGender'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/QaTEchHub/select_Select CourseSeleniumCypressTestComplete'), "Selenium", false)
	}

	@Then("click on submit button")
	def clickSubmit() {
		WebUI.click(findTestObject('Object Repository/QaTEchHub/button_Submit'))
	}

	@Then("verify title")
	def verifyTitle()
	
	{ print WebUI.getWindowTitle()
		assert WebUI.getWindowTitle() == "Form Elementdfds"
	}
}