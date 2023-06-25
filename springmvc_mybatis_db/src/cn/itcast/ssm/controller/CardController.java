package cn.itcast.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.original.CardTable;
import cn.itcast.ssm.service.CardService;

@Controller
public class CardController {

	@Autowired
	private CardService cardService;

	@RequestMapping("cardInit")
	public String cardInit()
			throws Exception {
	    return "cardInfo/cardList";
	}


	@RequestMapping("cardInitInsert")
	public String cardInitInsert()
			throws Exception {
	    return "cardInfo/cardInsert";
	}

	@RequestMapping("cardinsert")
	public String cardinsert(CardTable card)
			throws Exception {

		cardService.inserCard(card);
	    return "redirect:/cardInit.action";
	}




	@RequestMapping("queryCard")
	public String queryCardxxxxx(CardTable card,Model model)
			throws Exception {
		List<CardTable> lst = cardService.findCardList(card);

		model.addAttribute("cardLst", lst);

		model.addAttribute("cardx", card);
	    return "cardInfo/cardList";
	}

	@RequestMapping("editcard")
	public String editCardxxyyyyyy(CardTable card,Model model)
			throws Exception {
		CardTable cardDb = cardService.findCardByID(card.getCardId());

		model.addAttribute("card", cardDb);

	    return "cardInfo/cardUpdate";
	}



	@RequestMapping("cardupdate")
	public String updateCard(CardTable card)
			throws Exception {
		cardService.updateCard(card);


	    return "redirect:/queryCard.action";
	}



	@RequestMapping("deleteCard")
	public String deleteCard(String[] cards_id)
			throws Exception {
		cardService.deleteItems(cards_id);
	    return "redirect:/queryCard.action";
	}


}