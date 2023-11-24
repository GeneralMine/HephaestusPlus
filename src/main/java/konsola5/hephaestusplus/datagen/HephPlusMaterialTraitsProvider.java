package konsola5.hephaestusplus.datagen;

import konsola5.hephaestusplus.Registry;
import konsola5.hephaestusplus.ids.MoarMaterialIds;
import konsola5.hephaestusplus.ids.MoarModifierIds;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.data.material.AbstractMaterialTraitDataProvider;
import slimeknights.tconstruct.library.materials.stats.MaterialStatsId;
import slimeknights.tconstruct.tools.TinkerModifiers;
import slimeknights.tconstruct.tools.data.ModifierIds;
import slimeknights.tconstruct.tools.stats.ExtraMaterialStats;

import java.lang.reflect.Modifier;

public class HephPlusMaterialTraitsProvider extends AbstractMaterialTraitDataProvider {
    public HephPlusMaterialTraitsProvider(FabricDataOutput output, AbstractMaterialDataProvider materials) {
        super(output, materials);
    }

    @Override
    public String getName() {
        return "HephaestusPlus Material Traits";
    }

    @Override
    protected void addMaterialTraits() {
        addDefaultTraits(MoarMaterialIds.adamantite, ModifierIds.sharpness);
        addDefaultTraits(MoarMaterialIds.aquarium, TinkerModifiers.hydraulic);
        addDefaultTraits(MoarMaterialIds.banglum, MoarModifierIds.bang_bang);
        addDefaultTraits(MoarMaterialIds.carmot, MoarModifierIds.carmot_synergy);
        addTraits(MoarMaterialIds.carmot, ExtraMaterialStats.ID, ModifierIds.fortune);
        addDefaultTraits(MoarMaterialIds.celestium, MoarModifierIds.unobtainable, ModifierIds.worldbound);
        addDefaultTraits(MoarMaterialIds.durasteel, MoarModifierIds.durable);
        addDefaultTraits(MoarMaterialIds.hallowed, MoarModifierIds.soul_powered);
        addDefaultTraits(MoarMaterialIds.kyber, MoarModifierIds.prismatic);
        addDefaultTraits(MoarMaterialIds.metallurgium, MoarModifierIds.unobtainable, ModifierIds.worldbound);
        addDefaultTraits(MoarMaterialIds.mythril, MoarModifierIds.magically_modifiable);
        addDefaultTraits(MoarMaterialIds.orichalcum, MoarModifierIds.solid);
        addDefaultTraits(MoarMaterialIds.palladium, MoarModifierIds.branding);
        addDefaultTraits(MoarMaterialIds.prometheum, MoarModifierIds.regrowth);
        addDefaultTraits(MoarMaterialIds.quadrillum, MoarModifierIds.cosmic);
        addDefaultTraits(MoarMaterialIds.runite, MoarModifierIds.freezing);
        addDefaultTraits(MoarMaterialIds.star_platinum, MoarModifierIds.stellar_swiftness);
        addDefaultTraits(MoarMaterialIds.stormyx, MoarModifierIds.storm_spell);
    }
}
