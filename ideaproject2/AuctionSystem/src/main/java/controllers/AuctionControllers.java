package controllers;

import com.auction.model.Auction;
import com.auction.service.AuctionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    @GetMapping("/list")
    public <Auction> List<Auction> getAllAuctions() {
        return  AuctionController.getAllAuctions();
    }

    @PostMapping("/create")
    public AuctionController createAuction(@RequestBody Auction auction) {
        return AuctionController.createAuction(auction);
    }
}
