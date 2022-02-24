package dev.norska.dwaddon.dswt.addon;

import java.util.List;

import org.bukkit.entity.Player;

import dev.norska.dsw.api.DeluxeSellwandsAPI;
import dev.norska.dw.api.DWAddonInterface;
import dev.norska.dwaddon.dswt.DSWTAddon;

public class DSWTInterface implements DWAddonInterface {

	@Override
	public void add(Player p, Double amount) {
		DeluxeSellwandsAPI.addPlayerTokens(p.getUniqueId(), amount.intValue());
	}

	@Override
	public void add(Player p, Integer amount) {
		DeluxeSellwandsAPI.addPlayerTokens(p.getUniqueId(), amount);
	}

	@Override
	public String adminCreator() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getCreatorForAdminItems();
	}

	@Override
	public int currencyFormat() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getCurrencyFormat();
	}

	@Override
	public String currencyString() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getCurrencyName();
	}

	@Override
	public Double getCurrent(Player p) {
		return (double) DeluxeSellwandsAPI.getPlayerTokens(p.getUniqueId());
	}

	@Override
	public Boolean has(Player p, Double amount) {
		return DeluxeSellwandsAPI.getPlayerTokens(p.getUniqueId()) >= amount;
	}

	@Override
	public Boolean has(Player p, Integer amount) {
		return DeluxeSellwandsAPI.getPlayerTokens(p.getUniqueId()) >= amount;
	}

	@Override
	public String layout() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getItemLayout();
	}

	@Override
	public Double maxWithdraw() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getMaxWithdraw();
	}

	@Override
	public Double minWithdraw() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getMinWithdraw();
	}

	@Override
	public void set(Player p, Double arg1) {
		
		
	}

	@Override
	public void set(Player p, Integer amount) {
		
	}

	@Override
	public void take(Player p, Double amount) {
		DeluxeSellwandsAPI.takePlayerTokens(p.getUniqueId(), amount.intValue());
	}

	@Override
	public void take(Player p, Integer amount) {
		DeluxeSellwandsAPI.takePlayerTokens(p.getUniqueId(), amount);
	}

	@Override
	public List<String> withdrawCommands() {
		return DSWTAddon.getInstance().getNHandler().getCacheHandler().getCommands();
	}

	@Override
	public void reloadConfiguration() {
		DSWTAddon.getInstance().generateFiles();
		DSWTAddon.getInstance().cache();
	}

}
