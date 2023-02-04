<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HomeView from './views/HomeView.vue';
</script>

<template>
  <header>
    <div>
      <HomeView />
    </div>
  </header>

  <RouterView />
</template>
