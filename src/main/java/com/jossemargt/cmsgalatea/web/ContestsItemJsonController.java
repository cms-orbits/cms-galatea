package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Contest;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import com.jossemargt.cmsgalatea.service.api.ContestService;
import io.springlets.web.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

/**
 * = ContestsItemJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Contest.class, pathPrefix = "/galatea/v1/", type = ControllerType.ITEM)
@RooJSON
@RestController
@RequestMapping(value = "/galatea/v1/contests/{contest}", name = "ContestsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContestsItemJsonController {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ContestService contestService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param contestService
     */
    @Autowired
    public ContestsItemJsonController(ContestService contestService) {
        this.contestService = contestService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return ContestService
     */
    public ContestService getContestService() {
        return contestService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contestService
     */
    public void setContestService(ContestService contestService) {
        this.contestService = contestService;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param id
     * @return Contest
     */
    @ModelAttribute
    public Contest getContest(@PathVariable("contest") Long id) {
        Contest contest = contestService.findOne(id);
        if (contest == null) {
            throw new NotFoundException(String.format("Contest with identifier '%s' not found", id));
        }
        return contest;
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> show(@ModelAttribute Contest contest) {
        return ResponseEntity.ok(contest);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @param contest
     * @return UriComponents
     */
    public static UriComponents showURI(Contest contest) {
        return MvcUriComponentsBuilder.fromMethodCall(MvcUriComponentsBuilder.on(ContestsItemJsonController.class).show(contest)).buildAndExpand(contest.getId()).encode();
    }
}
