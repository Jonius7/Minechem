package minechem.common.blocks;

import minechem.common.ModMinechem;
import minechem.common.utils.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class OreUranium extends Block
{
    private Icon icon1, icon2;

    public OreUranium(int id)
    {
        super(id, Material.iron);
        setCreativeTab(ModMinechem.CREATIVE_TAB);
        setUnlocalizedName("minechem.uraniumOre");
        this.setHardness(4F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister ir)
    {
        blockIcon = ir.registerIcon(Reference.URANIUM_TEX);
    }
}
