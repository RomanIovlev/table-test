package org.mytests.tests.example;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.ui.html.PageFactory;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.mytests.uiobjects.example.secret.CompanyInfo;
import org.mytests.uiobjects.example.secret.SecretPage;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.*;
import static com.epam.jdi.light.ui.html.HtmlFactory.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mytests.uiobjects.example.secret.SecretPage.companies;
import static org.testng.Assert.assertEquals;

public class Secret {
    @Test
    public void secterTest() {
        PageFactory.initElements(SecretPage.class);
        assertThat(companies.size(), is(4));
        assertThat(companies.header(), hasItems("Company Name", "Contact", "Phone", "Action Btns"));
        openUrl("https://jdi-testing.github.io/jdi-light/");
        $("img#user-icon").click();
        $("#name").sendKeys("Roman");
        $("#password").sendKeys("Jdi1234");
        $("#login-button").click();
        openUrl("https://jdi-testing.github.io/jdi-light/secret.html");
        assertThat(companies.cell(1,1), is("CompanyID201905131541"));
        assertThat(companies.allData(), hasItems(
            new CompanyInfo().set(c-> {
                c.companyName="CompanyID201905131541"; c.contact="autotest developer"; c.phone="+61484042648";}),
            new CompanyInfo().set(c-> {
                c.companyName="CompanyID201905131542"; c.contact="autotest developer"; c.phone="+61484042648";}),
            new CompanyInfo().set(c-> {
                c.companyName="CompanyID201905131550"; c.contact="autotest developer"; c.phone="+61484042648";})
        ));

    }
}
