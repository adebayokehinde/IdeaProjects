package controllers;

import com.auction.model.Bid;
import com.auction.service.BidService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/bids")
public class BidController {

    private final BidService bidService;

    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    @PostMapping("/place")
    public String placeBid(@RequestParam("auctionId") Long auctionId, @RequestParam("bidAmount") Double bidAmount) {
        return bidService.placeBid(auctionId, bidAmount);
    }
}
