<template>
    <v-card outlined>
        <v-card-title>
            AcceptDelivery
        </v-card-title>

        <v-card-text>
            <Number label="DeliveryJobId" v-model="value.deliveryJobId" :editMode="editMode"/>
            <Number label="RiderId" v-model="value.riderId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="acceptDelivery"
            >
                AcceptDelivery
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
        name: 'AcceptDeliveryCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.deliveryJobId = 0;
            this.value.riderId = 0;
        },
        watch: {
        },
        methods: {
            acceptDelivery() {
                this.$emit('acceptDelivery', this.value);
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

