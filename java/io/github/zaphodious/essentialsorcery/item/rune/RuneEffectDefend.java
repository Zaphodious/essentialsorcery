package io.github.zaphodious.essentialsorcery.item.rune;

import io.github.zaphodious.essentialsorcery.spellcasting.abstractrunes.RuneEffect;

public class RuneEffectDefend extends RuneEffect {

	public RuneEffectDefend(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTitleString() {
		// TODO Auto-generated method stub
		return "Defense";
	}

	@Override
	public boolean fireEffect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean waterEffect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean airEffect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean earthEffect() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean woodEffect() {
		// TODO Auto-generated method stub
		return false;
	}

}
