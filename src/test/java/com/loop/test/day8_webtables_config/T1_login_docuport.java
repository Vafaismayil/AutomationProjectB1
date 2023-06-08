package com.loop.test.day8_webtables_config;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import org.testng.annotations.Test;

public class T1_login_docuport extends TestBase {

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(5000);
        DocuportUtils.login(driver, DocuportConstants.CLIENT);
        DocuportUtils.logOut(driver);
        DocuportUtils.login(driver, DocuportConstants.ADVISOR);
        DocuportUtils.logOut(driver);
        DocuportUtils.login(driver, DocuportConstants.SUPERVISOR);
        DocuportUtils.logOut(driver);
        DocuportUtils.login(driver, DocuportConstants.EMPOLYEE);
        DocuportUtils.logOut(driver);
    }


}
