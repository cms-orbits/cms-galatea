package com.jossemargt.cmsgalatea.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.test.RooJsonControllerIntegrationTest;
import com.jossemargt.cmsgalatea.model.dod.TaskFactory;
import com.jossemargt.cmsgalatea.service.api.TaskService;
import io.springlets.boot.test.autoconfigure.web.servlet.SpringletsWebMvcTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * = TasksItemJsonControllerIT
 TODO Auto-generated class documentation
 *
 */
@RooJsonControllerIntegrationTest(targetClass = TasksItemJsonController.class)
@RunWith(SpringRunner.class)
@SpringletsWebMvcTest(controllers = TasksItemJsonController.class, secure = false)
public class TasksItemJsonControllerIT {
}
