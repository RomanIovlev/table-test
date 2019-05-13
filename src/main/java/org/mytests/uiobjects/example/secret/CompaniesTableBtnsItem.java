package org.mytests.uiobjects.example.secret;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdi.light.ui.html.common.Button;

public class CompaniesTableBtnsItem extends Section {
    @Css(".js-print-label") public Button printBtn;
    @Css(".js-client-grid-edit") public Button editBtn;
    @Css(".js-client-grid-delete") public Button deleteBtn;
}
