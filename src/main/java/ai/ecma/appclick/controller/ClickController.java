package ai.ecma.appclick.controller;


import ai.ecma.appclick.payload.ClickDTO;
import ai.ecma.appclick.service.ClickService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/click")
@RequiredArgsConstructor
public class ClickController {

    //https://docs.click.uz/click-api-request/

    private final ClickService clickService;

    @PostMapping(value = "/prepare")
    public ClickDTO prepareMethod(@RequestBody ClickDTO clickDTO) {
        return clickService.prepareMethod(clickDTO);
    }


    @PostMapping(value = "/complete")
    public ClickDTO completeMethod(@RequestBody ClickDTO clickDTO) {
        return clickService.completeMethod(clickDTO);
    }
}
