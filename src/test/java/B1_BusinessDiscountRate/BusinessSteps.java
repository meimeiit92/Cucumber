package B1_BusinessDiscountRate;

import BusinessDiscountRate.Customer;
import BusinessDiscountRate.Visit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class BusinessSteps {
    Customer customer = null;
    Visit visit = null;
    double total = 0;

    //    @Given("Customer {String} and {String} and {String}")
    @Given("^Customer (.+) and (.+) and (.+)$")
    public void customerNameAndIsMemberAndMemberType(String name, String isMember, String memberType) {
        customer = new Customer(name, Boolean.parseBoolean(isMember), memberType);
        System.out.println(customer.toString());


    }

    @When("^Customer shopping in (.+) with (.+) and (.+)$")
    public void customerShoppingInDate(String date, Double serviceExpense, Double productExpense) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy", Locale.ENGLISH);
        visit = new Visit(customer, formatter.parse(date));
        visit.setServiceExpense(serviceExpense);
        visit.setProductExpense(productExpense);
        total = visit.getTotalExpense();
    }

    @Then("^Total expense is (.+)$")
    public void totalExpenseIsTotalExpense(Double totalExpense) {
        Assertions.assertEquals(totalExpense, total);
    }


}
