package com.salesmore.yak.integration.shopee.service.client;


import com.salesmore.yak.integration.core.api.exceptions.AuthenticationException;
import com.salesmore.yak.integration.shopee.model.common.Credentials;
import com.salesmore.yak.integration.core.service.BaseRestClientBuilder;
import com.salesmore.yak.integration.shopee.api.IShopeeClientBuilder;
import com.salesmore.yak.integration.shopee.api.ShopeeClient;

/**
 * Builder to create a client
 *
 */
public class ShopeeClientBuilder extends BaseRestClientBuilder<ShopeeClient, IShopeeClientBuilder> implements IShopeeClientBuilder {

    private long partnerId;
    private String partnerKey;
    private long shopId;

    @Override
    public IShopeeClientBuilder partnerId(long partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    @Override
    public IShopeeClientBuilder partnerKey(String key) {
        this.partnerKey = key;
        return this;
    }

    @Override
    public IShopeeClientBuilder shopId(long shopId) {
        this.shopId = shopId;
        return this;
    }

    @Override
    public ShopeeClient authenticate() throws AuthenticationException {
        return ShopeeClientSession.createSession(endpoint, new Credentials(partnerId, partnerKey, shopId), config);
    }
}
