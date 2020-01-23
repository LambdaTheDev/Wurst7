/*
 * Copyright (C) 2014 - 2020 | Alexander01998 | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.other_features;

import net.wurstclient.SearchTags;
import net.wurstclient.other_feature.OtherFeature;

@SearchTags({"Clean Up"})
public final class CleanUpOtf extends OtherFeature
{
	public CleanUpOtf()
	{
		super("CleanUp",
			"Cleans up your server list.\n"
				+ "To use it, press the 'Clean Up' button\n"
				+ "on the server selection screen.");
	}
}
