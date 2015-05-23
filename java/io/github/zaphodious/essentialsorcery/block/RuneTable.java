package io.github.zaphodious.essentialsorcery.block;

import io.github.zaphodious.essentialsorcery.core.EssentialSorcery;
import io.github.zaphodious.essentialsorcery.core.Reference;
import io.github.zaphodious.essentialsorcery.gui.GUIs;
import io.github.zaphodious.essentialsorcery.item.ModItems;
import io.github.zaphodious.essentialsorcery.tileentities.TileEntityRuneTable;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class RuneTable extends BasicBlock implements ITileEntityProvider {

	public RuneTable(String unlocalizedName) {
		super(unlocalizedName, Material.wood, 0.1F, 0.1F);
		this.setUnlocalizedName(unlocalizedName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return ModItems.runeTablePlacer;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		
		return new TileEntityRuneTable();
	}
	
	@Override
	public boolean hasTileEntity() {
		return true;
	}
	

	
	    public boolean onBlockActivated(World world, BlockPos pos, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
	        if(world.isRemote) {
	            if (world.getTileEntity(pos) != null)
	            	player.openGui(EssentialSorcery.instance, GUIs.RUNE_DESK.ordinal(), world, pos.getX(), pos.getY(), pos.getZ());
	            return true;
	        }
	        return true;
	    }


}