
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CustomerOrderManager from "./components/listers/CustomerOrderCards"
import CustomerOrderDetail from "./components/listers/CustomerOrderDetail"

import DeliveryDeliveryJobManager from "./components/listers/DeliveryDeliveryJobCards"
import DeliveryDeliveryJobDetail from "./components/listers/DeliveryDeliveryJobDetail"

import BusinessOwnerRestaurantManager from "./components/listers/BusinessOwnerRestaurantCards"
import BusinessOwnerRestaurantDetail from "./components/listers/BusinessOwnerRestaurantDetail"

import DeliveryManagerDeliveryManager from "./components/listers/DeliveryManagerDeliveryCards"
import DeliveryManagerDeliveryDetail from "./components/listers/DeliveryManagerDeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/customers/orders',
                name: 'CustomerOrderManager',
                component: CustomerOrderManager
            },
            {
                path: '/customers/orders/:id',
                name: 'CustomerOrderDetail',
                component: CustomerOrderDetail
            },

            {
                path: '/deliveries/deliveryJobs',
                name: 'DeliveryDeliveryJobManager',
                component: DeliveryDeliveryJobManager
            },
            {
                path: '/deliveries/deliveryJobs/:id',
                name: 'DeliveryDeliveryJobDetail',
                component: DeliveryDeliveryJobDetail
            },

            {
                path: '/businessOwners/restaurants',
                name: 'BusinessOwnerRestaurantManager',
                component: BusinessOwnerRestaurantManager
            },
            {
                path: '/businessOwners/restaurants/:id',
                name: 'BusinessOwnerRestaurantDetail',
                component: BusinessOwnerRestaurantDetail
            },

            {
                path: '/deliveryManagers/deliveries',
                name: 'DeliveryManagerDeliveryManager',
                component: DeliveryManagerDeliveryManager
            },
            {
                path: '/deliveryManagers/deliveries/:id',
                name: 'DeliveryManagerDeliveryDetail',
                component: DeliveryManagerDeliveryDetail
            },



    ]
})
