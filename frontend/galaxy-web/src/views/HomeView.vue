<script setup>
import { hello } from '@/api/home'
import { ref } from '@vue/reactivity';
const message = ref('')
hello('galaxy').then((result) => {
  message.value = result
}).catch((err) => {
  message.value = err
});
</script>

<template>
  <main>
    <p>{{ message }}</p>
  </main>
</template>

<style scoped>
  main p {
    font-size: 3em;
    text-align: center;
  }
</style>
