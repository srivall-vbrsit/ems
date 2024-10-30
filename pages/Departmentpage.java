package pages;


	import java.time.Duration;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	public class Departmentpage {
		WebDriver driver;
		WebDriverWait wait;
		public Departmentpage(WebDriver driver) {
			this.driver=driver;
			this.wait=new WebDriverWait(driver, Duration.ofSeconds(20));
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//span[text()='Department']")WebElement click_on_department_module;
		@FindBy(xpath="//button[text()='Add Department']")WebElement click_on_add_department;
		@FindBy(id="designation")WebElement enter_department;
		
		@FindBy(xpath="//button[@type='submit']/../../../../following-sibling::div/child::div/child::div/child::div[2]/child::form/child::div[2]/child::button[@type=\"submit\"]")WebElement click_on_add_department_btn;
		@FindBy(xpath="//button[text()='Cancel']")WebElement click_on_cancel_button;
		@FindBy(xpath="//input[@placeholder='Enter Department']/following-sibling::p")WebElement error_message;
		@FindBy(xpath="//a[text()='Home']")WebElement click_on_home_button;
		@FindBy(xpath="//input[@class='form-control']")WebElement enter_dept_name;
		@FindBy(xpath="//div[@id='cell-2-department-98aad864dfa73563a20326e0dd6f5e0a']/following-sibling::div/child::div/child::button[@title=\"Edit\"]")WebElement click_on_edit_button;
		@FindBy(xpath="//button[@class='btn btn-danger']")WebElement click_on_udate_dept;
		@FindBy(xpath="//div[@id='cell-2-department-98aad864dfa73563a20326e0dd6f5e0a']/following-sibling::div/child::div/child::button[2]")WebElement click_on_delete_icon;
		public void click_on_deparrtment_module() {
			click_on_department_module.click();
		}
		public void click_on_add_department() {
			click_on_add_department.click();
		}
		public void enter_department_name(String department) {
			enter_department.sendKeys(department);
		}
		public void click_on_department_or_cancel() {
//			String actual=wait.until(ExpectedConditions.visibilityOf(error_message)).getText();
//			if(actual.equals("error_message")) {
//				click_on_cancel_button.click();
//			}else if(!actual.equals("error_message")) {
//				click_on_add_department_btn.click();
//			}
			click_on_add_department_btn.click();
		}
		public void enter_dept_name_into_search(String deptname) {
			enter_dept_name.sendKeys(deptname);
		}
			public void click_on_home_page() throws InterruptedException {
				Thread.sleep(5000);
				click_on_home_button.click();
			}
			public void click_on_edit_button() {
				click_on_edit_button.click();
			}
			public void update_the_dept_name(String deptname) {
				enter_department.clear();
			enter_department.sendKeys(deptname);
			}
			public void click_on_update_dept() {
				click_on_udate_dept.click();
			}
			public void click_on_delete_button() {
				 click_on_delete_icon.click();
			}
		}










