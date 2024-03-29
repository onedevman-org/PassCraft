package mc.passcraft.chestinterface.bukkit;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import mc.passcraft.chestinterface.components.ChestInterface;
import mc.passcraft.chestinterface.events.ChestInterfaceEvent;

public class BukkitChestInterfaceIdentifier implements InventoryHolder {

    private final ChestInterface<? extends ChestInterfaceEvent> _chest_interface;

    //

    public BukkitChestInterfaceIdentifier(ChestInterface<? extends ChestInterfaceEvent> chest_interface) {
        this._chest_interface = chest_interface;
    }

    //

    public ChestInterface<? extends ChestInterfaceEvent> chestInterface() { return this._chest_interface; }

    //

    @Override
    public Inventory getInventory() {
        return this.chestInterface().toBukkit();
    }

}
