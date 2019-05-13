package org.mytests.uiobjects.example.secret;

import com.epam.jdi.light.elements.complex.table.DataTable;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.UI;

public class SecretPage extends WebPage {
    @UI("#company-list-grid table")
    public static DataTable<CompanyRow, CompanyInfo> companies;
}
