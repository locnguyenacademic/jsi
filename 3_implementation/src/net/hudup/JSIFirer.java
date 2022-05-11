/**
 * The Jagged Strategy Investment (JSI) project provides lightweight software for investors to invest with stocks and forex products.
 * (C) Copyright by Loc Nguyen
 * Project homepage: ai.locnguyen.net
 * Email: ng_phloc@yahoo.com
 * Phone: +84-975250362
 */
package net.hudup;

import net.hudup.core.Firer;
import net.hudup.core.alg.AlgRemote;
import net.hudup.core.alg.AlgRemoteWrapper;

/**
 * This is advanced plug-in manager which derives from {@link Firer}.
 * 
 * @author Loc Nguyen
 * @version 2.0
 *
 */
public class JSIFirer extends Firer {

	
	@Override
	public void fireSimply() {
		super.fireSimply();
	}

	
	@Override
	public AlgRemoteWrapper wrap(AlgRemote remoteAlg, boolean exclusive) {
		return super.wrap(remoteAlg, exclusive);
	}

	
}
