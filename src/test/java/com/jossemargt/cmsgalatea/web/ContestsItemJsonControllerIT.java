package com.jossemargt.cmsgalatea.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.test.RooJsonControllerIntegrationTest;
import com.jossemargt.cmsgalatea.model.dod.ContestFactory;
import com.jossemargt.cmsgalatea.service.api.ContestService;
import io.springlets.boot.test.autoconfigure.web.servlet.SpringletsWebMvcTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * = ContestsItemJsonControllerIT
 TODO Auto-generated class documentation
 *
 */
@RooJsonControllerIntegrationTest(targetClass = ContestsItemJsonController.class)
@RunWith(SpringRunner.class)
@SpringletsWebMvcTest(controllers = ContestsItemJsonController.class, secure = false)
public class ContestsItemJsonControllerIT {
}
