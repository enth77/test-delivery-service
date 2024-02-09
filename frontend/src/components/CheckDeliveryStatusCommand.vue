<template>
    <v-card outlined>
        <v-card-title>
            CheckDeliveryStatus
        </v-card-title>

        <v-card-text>
            <Number label="DeliveryId" v-model="value.deliveryId" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="checkDeliveryStatus"
            >
                CheckDeliveryStatus
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
        name: 'CheckDeliveryStatusCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.deliveryId = 0;
        },
        watch: {
        },
        methods: {
            checkDeliveryStatus() {
                this.$emit('checkDeliveryStatus', this.value);
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

