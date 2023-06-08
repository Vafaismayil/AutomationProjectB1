package com.loop.test.day6_task;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.DocuportUtils;
import org.testng.annotations.Test;

public class LoginDocuport extends TestBase {
    @Test
    public void test(){
        DocuportUtils.login(driver, DocuportConstants.EMPOLYEE);
      DocuportUtils.logOut(driver) ;
    }
}
