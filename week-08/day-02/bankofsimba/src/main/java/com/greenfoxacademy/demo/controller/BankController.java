package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    private List<BankAccount> bankAccounts;
    private BankAccount simba;
    private BankAccount zazu;
    private BankAccount scar;
    private BankAccount mufasa;
    private BankAccount kira;


    public BankController() {
        bankAccounts = new ArrayList<>();

        simba = new BankAccount("Simba", 2000, "lion", "King", true);
        zazu = new BankAccount("Zazu", 3000, "bird", "Not King", true);
        scar = new BankAccount("Scar", 14400, "lion", "Not King", false);
        mufasa = new BankAccount("Mufasa", 2000, "monkey", "Not King", true);
        kira = new BankAccount("Kira", 0, "lion", "Not King", true);

        bankAccounts.add(simba);
        bankAccounts.add(zazu);
        bankAccounts.add(scar);
        bankAccounts.add(mufasa);
        bankAccounts.add(kira);
    }

    @GetMapping("/show")
    public String showBankAccounts(ModelMap modelMap) {
        modelMap.addAttribute("simba", simba);
        return "index";
    }

    @GetMapping("/inception")
    public String showInception(ModelMap modelMap) {
        modelMap.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "inception";
    }

    @GetMapping("/character-accounts")
    public String showCharacterAccounts(ModelMap modelMap, @ModelAttribute BankAccount bankAccount) {
        modelMap.addAttribute("bankAccountList", bankAccounts);
        modelMap.addAttribute("bankAccount", bankAccount);
        return "character-accounts";
    }

    @PostMapping("/character-accounts/increase")
    public String increaseBalance(@ModelAttribute(name="id") Integer id) {
        for (BankAccount account : bankAccounts) {
            if (account.getId() == id) {
                if (account.getIsKingOrNot() == "King") {
                    account.setBalance(account.getBalance() + 100);
                } else {
                    account.setBalance(account.getBalance() + 10);
                }
            }
        }
        return "redirect:/character-accounts";
    }

    @PostMapping("/character-accounts/add")
    public String addCharacter(@ModelAttribute(name="bankAccount") BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
        return "redirect:/character-accounts";
    }
}
