package com.example.ss7_baitap2.controller;

import com.example.ss7_baitap2.dto.SongDto;
import com.example.ss7_baitap2.model.Song;
import com.example.ss7_baitap2.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("/song/list")
    public String showSong(Model model) {
        model.addAttribute("songList", songService.display());
        return "/list";
    }

    @GetMapping("/song/create")
    public String showCreate(Model model) {
        model.addAttribute("songDto", new SongDto());
        return "/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute SongDto songDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        Song song = new Song();
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/create";
        }
        BeanUtils.copyProperties(songDto, song);
        songService.add(song);
        redirectAttributes.addFlashAttribute("mess", "adđ success");
        return "redirect:/song/list";
    }

    @GetMapping("/song/edit")
    public String showEdit(@RequestParam int id, Model model) {
        Song song = songService.song(id);
        SongDto songDto = new SongDto();
        BeanUtils.copyProperties(song, songDto);
        model.addAttribute("songDto", songDto);
        model.addAttribute("id", id);
        return "/edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute SongDto songDto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        Song song = new Song();
        new SongDto().validate(songDto, bindingResult);
        if (bindingResult.hasErrors()) {
            return "/edit";
        }
        BeanUtils.copyProperties(songDto,song);
        songService.add(song);
        redirectAttributes.addFlashAttribute("mess", "edit success");
        return "redirect:/song/list";
    }
}
