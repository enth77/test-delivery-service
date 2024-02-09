<template>
    <v-card outlined>
        <v-card-title>
            RegisterMenu
        </v-card-title>

        <v-card-text>
            <Number label="RestaurantId" v-model="value.restaurantId" :editMode="editMode"/>
            <String label="RestaurantName" v-model="value.restaurantName" :editMode="editMode"/>
            <String label="FoodMenu" v-model="value.foodMenu" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="registerMenu"
            >
                RegisterMenu
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RegisterMenuCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.restaurantId = 0;
            this.value.restaurantName = '';
            this.value.foodMenu = '';
        },
        watch: {
        },
        methods: {
            registerMenu() {
                this.$emit('registerMenu', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

