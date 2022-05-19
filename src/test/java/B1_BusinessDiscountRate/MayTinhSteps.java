package B1_BusinessDiscountRate;

import B1_Cucumber_MayTinh.MayTinh;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MayTinhSteps {
    private MayTinh maytinh;
    private long tmp;
    private Exception e;
    @Given("tao mot may tinh")
    public void taoMotMayTinh() {
        maytinh = new MayTinh();

    }


    @When("tinh tong {long} va {long}")
    public void tinhTongVa(long a, long b) {
        tmp = maytinh.tong(a,b);

    }

    @Then("ket qua nen bang {long}")
    public void ketQuaNenBang(long result) {
        Assertions.assertEquals(result,tmp);
    }

    @When("tinh thuong {long} va {long}")
    public void tinhThuongVa(long a, long b) {
        e = Assertions.assertThrows(Exception.class,()->{
            maytinh.thuong(a,b);
        });
    }

    @Then("nem ra exception {string}")
    public void nemRaException(String expectedClass) {
        Assertions.assertEquals(expectedClass,e.getClass().getSimpleName());
    }

    @And("noi dung la {string}")
    public void noiDungLa(String arg0) {
        Assertions.assertEquals(arg0,e.getMessage());
    }
}








