package registrationSystem.registration.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import registrationSystem.registration.entity.Library;
import registrationSystem.registration.repository.repository;

import java.util.List;

@Controller
public class controller {
    @Autowired
    public repository repo;
    @GetMapping("/")
    public String home(Model theModel){
        List<Library> library= repo.findAll();
        theModel.addAttribute("list",library);
        return "index.html";
    }
    @GetMapping("/add_book")
    public String addBook(Model theModel){
        Library library=new Library();
        theModel.addAttribute("lib",library);
        return "add_book";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("lib") Library library){
         repo.save(library);
         return "redirect:/";
    }

    @GetMapping("/edit")
    public String edit(Model theModel, @RequestParam int id){
        Library library=repo.findById(id).get();
        theModel.addAttribute("library",library);
        return "edit";
    }
    @PostMapping("/update")
    public String update(@RequestParam int id, @ModelAttribute("library") Library theLibrary){
        repo.save(theLibrary);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, Model theModel){
        Library library=repo.findById(id).get();
        theModel.addAttribute("library",library);
        repo.delete(library);
        return "redirect:/";
    }
}
