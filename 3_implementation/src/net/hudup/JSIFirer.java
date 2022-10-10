/**
 * The Jagged Strategy Investment (JSI) project provides lightweight software for investors to invest with stocks and forex products.
 * (C) Copyright by Loc Nguyen
 * Project homepage: ai.locnguyen.net
 * Email: ng_phloc@yahoo.com
 * Phone: +84-975250362
 */
package net.hudup;

import net.hudup.core.Constants;
import net.hudup.core.Firer;
import net.hudup.core.alg.AlgRemote;
import net.hudup.core.alg.AlgRemoteWrapper;
import net.hudup.core.logistic.LogUtil;
import net.hudup.core.logistic.UriAdapter;
import net.hudup.core.logistic.xURI;

/**
 * This is advanced plug-in manager which derives from {@link Firer}.
 * 
 * @author Loc Nguyen
 * @version 2.0
 *
 */
public class JSIFirer extends Firer {

	
	/**
	 * Directory of Join Stock Investment (JSI) tool.
	 */
	public final static String  JSI_DIRECTORY = Constants.WORKING_DIRECTORY + "/jsi";

	
	@Override
	public void fireSimply() {
		super.fireSimply();
		
		try {
			UriAdapter adapter = new UriAdapter(Constants.WORKING_DIRECTORY);
			
			xURI working = xURI.create(JSI_DIRECTORY);
			if (!adapter.exists(working)) adapter.create(working, true);
			
			adapter.close();
		}
		catch (Throwable e) {
			LogUtil.trace(e);
		}
	}

	
	@Override
	public AlgRemoteWrapper wrap(AlgRemote remoteAlg, boolean exclusive) {
		return super.wrap(remoteAlg, exclusive);
	}

	
}
