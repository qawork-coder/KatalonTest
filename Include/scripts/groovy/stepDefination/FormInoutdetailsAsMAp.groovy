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




class FormInoutdetailsAsMAp {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User should launch the website1")
	def invokeAndLuanchBrowser() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl("https://test.qatechhub.com/form-elements/")
	}

	@When("User enters the input Details1")
	def inputDetails(DataTable	data) {
		Map<String,String> maspAsTable=data.asMap(String.class, String.class)



		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/firstName'), maspAsTable.get("firstName"))

		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/lastName'), maspAsTable.get("lastName"))

		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/emailAddress'),  maspAsTable.get("emailID"))

		WebUI.sendKeys(findTestObject('Object Repository/QaTEchHub/phoneNumber'), maspAsTable.get("PhoneNo"))

		WebUI.click(findTestObject('Object Repository/QaTEchHub/MaleGender'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/QaTEchHub/select_Select CourseSeleniumCypressTestComplete'), "Selenium", false)
	}

	@Then("click on submit button1")
	def clickSubmit() {
		WebUI.click(findTestObject('Object Repository/QaTEchHub/button_Submit'))
	}
}