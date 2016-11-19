/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, TeleStax Inc. and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 *   JBoss, Home of Professional Open Source
 *   Copyright 2007-2011, Red Hat, Inc. and individual contributors
 *   by the @authors tag. See the copyright.txt in the distribution for a
 *   full listing of individual contributors.
 *
 *   This is free software; you can redistribute it and/or modify it
 *   under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation; either version 2.1 of
 *   the License, or (at your option) any later version.
 *
 *   This software is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *   Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this software; if not, write to the Free
 *   Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *   02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package net.java.slee.resource.diameter.slg.events.avp;

import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * Defines an interface representing the UTRAN-Positioning-Info AVP type.
 * From the Diameter-based ELP SLg interface for Control Plane LCS (3GPP TS 29.172 V13.0.0) specification.
 *
 * <pre>
 * 7.4.29	UTRAN-Positioning-Info
 * 	The UTRAN-Positioning-Info AVP is of type Grouped.
 *
 * 	AVP format:
 * 		UTRAN-Positioning-Info ::= <AVP header: 2527 10415>
 * 														[ UTRAN-Positioning-Data ]
 * 														[ UTRAN-GANSS-Positioning-Data ]
 *														[ UTRAN-Additional-Positioning-Data ]
 * 														*[ AVP ]
 * </pre>
 *
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 */
public interface UTRANPositioningInfoAvp extends GroupedAvp {

  /*
    From 3GPP TS 29.172 V13.0.0

		7.4.33	UTRAN-Positioning-Data
		The UTRAN-Positioning-Data AVP is of type OctetString.
		It shall contain the encoded content of the "positioningDataDiscriminator" and the "positioningDataSet"
		included in the "positionData" Information Element as defined in 3GPP TS 25.413 [21].
  */
  public boolean hasUTRANPositioningData();
  public byte[] getUTRANPositioningData();
  public void setUTRANPositioningData(byte[] utranPositioningData);

  /*
		From 3GPP TS 29.172 V13.0.0

		7.4.34	UTRAN-GANSS-Positioning-Data
		The UTRAN-GANSS-Positioning-Data AVP is of type OctetString.
		It shall contain the encoded content of the "GANSS-PositioningDataSet" only,
		included in the "positionData" Information Element as defined in 3GPP TS 25.413 [21].

	*/
  public boolean hasUTRANGANSSPositioningData();
  public byte[] getUTRANGANSSPositioningData();
  public void setUTRANGANSSPositioningData(byte[] geranGANSSPositioningData);

  /*
    From 3GPP TS 29.172 V13.0.0

    7.4.63	UTRAN-Additional-Positioning-Data
    The UTRAN-Additional-Positioning-Data AVP is of type OctetString.
    It contains the "UTRAN Additional Positioning Data" Information Element as defined in 3GPP 25.413 [21].
  */
  public boolean hasUTRANAdditionalPositioningData();
  public byte[] getUTRANAdditionalPositioningData();
  public void setUTRANAdditionalPositioningData(byte[] utranAdditionalPositioningData);
}