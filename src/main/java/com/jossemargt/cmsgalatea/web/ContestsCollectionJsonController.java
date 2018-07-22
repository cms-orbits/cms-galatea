package com.jossemargt.cmsgalatea.web;
import com.jossemargt.cmsgalatea.model.Contest;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import com.jossemargt.cmsgalatea.model.ContestInfo;
import com.jossemargt.cmsgalatea.service.api.ContestService;
import io.springlets.data.domain.GlobalSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

/**
 * = ContestsCollectionJsonController
 TODO Auto-generated class documentation
 *
 */
@RooController(entity = Contest.class, pathPrefix = "/galatea/v1/", type = ControllerType.COLLECTION)
@RooJSON
@RestController
@RequestMapping(value = "/galatea/v1/contests", name = "ContestsCollectionJsonController", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContestsCollectionJsonController {

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
    public ContestsCollectionJsonController(ContestService contestService) {
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
     * @param globalSearch
     * @param pageable
     * @return ResponseEntity
     */
    @GetMapping(name = "list")
    public ResponseEntity<Page<ContestInfo>> list(GlobalSearch globalSearch, Pageable pageable) {
        Page<ContestInfo> contests = getContestService().findAll(globalSearch, pageable);
        return ResponseEntity.ok(contests);
    }

    /**
     * TODO Auto-generated method documentation
     *
     * @return UriComponents
     */
    public static UriComponents listURI() {
        return MvcUriComponentsBuilder.fromMethodCall(MvcUriComponentsBuilder.on(ContestsCollectionJsonController.class).list(null, null)).build().encode();
    }
}
