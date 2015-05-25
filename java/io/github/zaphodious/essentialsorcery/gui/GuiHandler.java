package io.github.zaphodious.essentialsorcery.gui;

import io.github.zaphodious.essentialsorcery.container.ContainerRuneTable;
import io.github.zaphodious.essentialsorcery.core.Reference;
import io.github.zaphodious.essentialsorcery.tileentities.TileEntityRuneTable;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiHandler implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, 
          World world, int x, int y, int z) 
    { 
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (tileEntity != null)
        {
            if (ID == GUI_ENUM.RUNE_TABLE.ordinal())
            {
                return new GuiRuneDesk(player.inventory, 
                      (TileEntityRuneTable)tileEntity);
            }
            /*if (ID == GUI_ENUM.RUNE_TABLE.ordinal())
            {
                return new ContainerCompactor(player.inventory, 
                      (IInventory)tileEntity);
            }
        }
        if (ID == Reference.GUI_ENUM.DECONSTRUCTOR.ordinal())
        {
            return new ContainerDeconstructor(player.inventory, world, 
                  x, y, z);
        }*/
    	}
        return null;
        
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, 
          World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));

        if (tileEntity != null)
        {
            if (ID == GUI_ENUM.RUNE_TABLE.ordinal())
            {
                return new GuiRuneDesk(player.inventory, 
                        (TileEntityRuneTable)tileEntity);
            }
            /*if (ID == Reference.GUI_ENUM.COMPACTOR.ordinal())
            {
                return new GuiCompactor(player.inventory, 
                      (IInventory)tileEntity);
            }
        }
        if (ID == Reference.GUI_ENUM.DECONSTRUCTOR.ordinal())
        {
            return new GuiDeconstructor(player.inventory, world, 
                  I18n.format("tile.deconstructor.name"), x, y, z);
        }*/
        }
        return null;
    }
}
