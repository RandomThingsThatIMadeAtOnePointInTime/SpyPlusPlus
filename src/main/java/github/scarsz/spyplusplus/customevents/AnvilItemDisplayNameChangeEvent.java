package github.scarsz.spyplusplus.customevents;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;

public class AnvilItemDisplayNameChangeEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    public HandlerList getHandlers() { return handlers; }
    public static HandlerList getHandlerList() { return handlers; }

    public AnvilItemDisplayNameChangeEvent(Player who, String newDisplayName, Location location, ItemStack itemStack) {
        super(who);
        this.newDisplayName = newDisplayName;
        this.location = location;
        this.itemStack = itemStack;
    }

    private String newDisplayName;
    public String getNewDisplayName() {
        return newDisplayName;
    }

    private Location location;
    public Location getLocation() {
        return location;
    }

    private ItemStack itemStack;
    public ItemStack getItemStack() {
        return itemStack;
    }

}
